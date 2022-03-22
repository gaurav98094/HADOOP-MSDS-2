import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;


public class Program 
{

    class Map1 extends MapReduceBase implements Mapper<Object, Text, IntWritable, Text>
{
    public void map(Object key, Text value, OutputCollector<IntWritable, Text> collector, Reporter arg3) throws IOException 
    {
        String line = value.toString();
        StringTokenizer stringTokenizer = new StringTokenizer(line);
        {
            int number = 999; 
            String word = "empty";

            if(stringTokenizer.hasMoreTokens())
            {
                String str0= stringTokenizer.nextToken();
                word = str0.trim();
            }

            if(stringTokenizer.hasMoreElements())
            {
                String str1 = stringTokenizer.nextToken();
                number = Integer.parseInt(str1.trim());
            }

            collector.collect(new Text(word)new IntWritable(number));
        }

    }

}


class Reduce1 extends MapReduceBase implements Reducer<IntWritable, Text, IntWritable, Text>
{
    public void reduce(IntWritable key, Iterator<Text> values, OutputCollector<IntWritable, Text> arg2, Reporter arg3) throws IOException
    {
        while((values.hasNext()))
        {
            arg2.collect(key, values.next());
        }
    }

}


  public static void main(String[] args) throws Exceptionguration conf = new Configuration();
    Job job = Job.getInstance(conf, "word count");
    job.setJarByClass(Program.class);
    job.setMapperClass(Map1.class);
    job.setCombinerClass(Reduce1.class);
    job.setReducerClass(Reduce1.class);
    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(IntWritable.class);
    FileInputFormat.addInputPath(job, new Path(args[0]));
    FileOutputFormat.setOutputPath(job, new Path(args[1]));
    System.exit(job.waitForCompletion(true) ? 0 : 1);
  }
}