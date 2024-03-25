public class AlphabetDisplay
{
    public static void main(String args[])
    {
        Runnable displayAlphabetsTask = () ->
        {
            char currentChar = 'A';
            try
            {
                while(currentChar <= 'Z')
                {
                    System.out.println(currentChar + " ");
                    currentChar++;
                    Thread.sleep(500);
                }
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(displayAlphabetsTask);
        thread.start();
    }
}