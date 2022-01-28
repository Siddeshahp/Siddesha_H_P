package Phase_1_project;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class project_phase1 
{
	File f1=new File("D:\\siddesha.txt");
	File f2=new File("D:\\");
	//Listing the Files in Ascending Order	
	public void ascending()
	{
		
		File f1=new File("D:\\");
		
		if(f1.isDirectory())
		{
			List<String> filelist=Arrays.asList(f1.list());
			System.out.println("\n");
			System.out.println("listing files in Ascending order:");
			System.out.println("\n");
			Collections.sort(filelist);
			for(String s:filelist)
			{
				System.out.println(s);
			}
			
		}
		else
		{
			System.out.println("Directory not found!");
		}
		
	}
		
	//Adding a File into Directory
	public void newfile() throws IOException
	{
		try {
		if(f1.createNewFile())
		{
			System.out.println("New File Created");
		}
		else
		{
			System.out.println("file not created");
		}
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		
	}
	//Deleting file from directory
	public void deletefile()
	{
		try
		{
			boolean b=f1.delete();
			if(b==true)
			{
				System.out.println("File deleted");
			}
			else
			{
				System.out.println("File not deleted");
			}
		}
		catch(Exception e)
		{
			System.out.println("file cannot be deleted");
		}
	}
	//searching the file in directory
	public void searchfile()
	{
		try
		{
			if(f1.exists())
			{
				System.out.println("the file is found inside the derectory");
			}
			else
			{
				System.out.println("file is not found");
			}
		}
		catch(Exception e)
		{
			System.out.println("file cannot found inside directory");
		}
	}
	//exit from the operation
	public void exit()
	{
		System.exit(0);
	}

public static void main(String[] args)
{
	char ch;
	project_phase1 p1=new project_phase1();
	p1.ascending();
	System.out.println("\n");
	do
	{
	System.out.println("enter your option:");
	System.out.println("1.add");
	System.out.println("2.remove");
	System.out.println("3.search");
	System.out.println("4.exit");
	System.out.println("\n");
	
	Scanner s1=new Scanner(System.in);
	int option=s1.nextInt();
	switch(option)
	{
	case 1:
		System.out.println("Adding new file into directory:");
		try
		{
			p1.newfile();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		break;
	case 2:
		System.out.println("removing file from Directory:");
		try 
		{
			p1.deletefile();
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		break;
	case 3:
		System.out.println("searching file inside the directory");
		try
		{
			p1.searchfile();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		break;
	case 4:
		System.out.println("Exit");
		p1.exit();
		break;
		default:
			System.out.println("Wrong operation");
		
	}
	
	
	System.out.println("\nDo you want to continue enter 'Y' or discontinue "
			+ "enter 'N' \n");
    ch = s1.next().charAt(0);
	}while(ch=='Y'||ch=='y');
	

}

}
