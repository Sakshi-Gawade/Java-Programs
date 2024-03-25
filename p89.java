import java.util.*;

class InvalidUserNameException extends Exception
{
    public String toString()
    {
        return "User name is invalid";
    }
}

class InvalidPasswordException extends Exception
{
    public String toString()
    {
        return "Password is invalid";
    }
}

class p89
{
    String username;
    String password;

    p89()
    {
        username="sakshi230@gmail.com";
        password = "1234";
    }

    p89(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    boolean isValid(String email)
    {
        String regex = "^(.+)@(\\S+)S";
        return email.matches(regex);
    }

    public static void main(String args[])
    {
        p89 obj = new p89();

        String username = args[0];
        String password = args[1];

        try
        {
            if(!obj.isValid(args[0]))
                throw new InvalidUserNameException();
            else if(!obj.username.equals(username))
                throw new InvalidUserNameException();
            if(!obj.password.equals(password))
                throw new InvalidPasswordException();
            System.out.println("User ID:"+obj.username);
            System.out.println("Password:"+obj.password);
        }
        catch(InvalidUserNameException e2)
        {
            System.out.println(e2);
        }
        catch(InvalidPasswordException e1)
        {
            System.out.println(e1);
        }
    }
}