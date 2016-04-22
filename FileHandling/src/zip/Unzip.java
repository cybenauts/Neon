package zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Unzip {

	public static ArrayList<String> fileList= new ArrayList<String>();
	
	public static void getfiles(File node)
	{
		if(node.isFile())
		{
			fileList.add(node.getAbsoluteFile().toString());
			
			if(node.isDirectory())
			{
				String [] innerFiles=node.list();
				for(String inner:innerFiles)
				{
					getfiles(new File(node,inner));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		File outDir=new File("D:\\MyZip");
		if(!outDir.exists())
		{
			outDir.mkdir();
		}
		try {
			FileOutputStream fout=new FileOutputStream(outDir+File.separator+"Zip");
		
		FileInputStream fin=new FileInputStream("D:\\MyZip.zip");
		ZipInputStream zin=new ZipInputStream(fin);
		File file=new File("D:\\MyZip.zip");
		getfiles(file);
		
		for(String fileName:fileList)
		{
			System.out.println(fileName+"Is being Unzipped");
			ZipEntry entry=zin.getNextEntry();
			
			int i=0;
			while((i=zin.read())!= -1)
			{
				fout.write(i);
			}
			zin.closeEntry();
			fin.close();
		}
		System.out.println("Unzipping Done");
		zin.close();
		fout.close();
		
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
