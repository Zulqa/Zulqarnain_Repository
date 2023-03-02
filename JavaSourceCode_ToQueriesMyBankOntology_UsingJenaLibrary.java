package jena;

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.SimpleSelector;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.util.FileManager;

public class Jena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = ModelFactory.createDefaultModel();

	   	 // use the FileManager to find the input file
	   	 //String inputFileName = "E:\\usman\\Cricket_Usman.owl";
	   	 String inputFileName = "C:\\Users\\Ashfaq Ahmad\\Desktop\\bankOntology.owl";
	   	 InputStream in = FileManager.get().open( inputFileName );
	   	if (in == null) {
	   	    throw new IllegalArgumentException(
	   	                                 "File: " + inputFileName + " not found");
	   	}

	   	// read the RDF/XML file
	   	model.read(in, null);
                //var1 input 
                //formuser 1 for q1 2 for q2
            //////////////if(user==1)
       System.out.println("Press:1>> Retrieve individual of all customer:");
       System.out.println("Press:2>> Retrive name of all customer:");
       System.out.println("Press:3>> Individual of Bank those offer loan:");
       System.out.println("Press:4>> Individual of Loan which is offer by bank:");
       System.out.println("Press:5>> Individual of customers witch is facility of loan:");
       System.out.println("Press:6>> Name of Banks:");
       
            Scanner scan = new Scanner(System.in);
             System.out.println("Enter your choice query:");
            int user_query = scan.nextInt();
            
            if(user_query==1){
                System.out.println(" Retrieved individual of all customer: ");
	    	Object obj1= null;
	    	
			//getresource
	   	SimpleSelector sel1 = (SimpleSelector) new SimpleSelector(null, model.getProperty("http://www.semanticweb.org/ashfaqahmad/ontologies/2020/11/untitled-ontology-17#hasAccountNo"), obj1);
	   	StmtIterator iter1 = model.listStatements(sel1);
	   	System.out.println("__________________");

	   	while (iter1.hasNext()) {
	   	    Statement stmt      = iter1.nextStatement();  // get next statement
	   	    Resource  subject   = stmt.getSubject();     // get the subject
	   	    Property  predicate = stmt.getPredicate();   // get the predicate
	   	    RDFNode   object    = stmt.getObject();      // get the object

	   	    System.out.print(subject.toString());
	   	    System.out.print(" " + predicate.toString() + " ");
	   	    if (object instanceof Resource) {
	   	       System.out.print(object.toString());
	   	    } else {
	   	        // object is a literal
	   	        System.out.print(" \"" + object.toString() + "\"");
	   	    }

	   	    System.out.println(" .");
	   	}
	   	
	   	System.out.println("______________");}
                
	   //newwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
           else if(user_query==2){
           
          System.out.println("Retrived name of all customer: ");
	    	Object obj2= null;
	    	
			//getresource
	   	SimpleSelector sel2 = (SimpleSelector) new SimpleSelector(null, model.getProperty("http://www.semanticweb.org/ashfaqahmad/ontologies/2020/11/untitled-ontology-17#cusHasName"), obj2);
	   	StmtIterator iter2 = model.listStatements(sel2);
	   	System.out.println("__________________");

	   	while (iter2.hasNext()) {
	   	    Statement stmt      = iter2.nextStatement();  // get next statement
	   	    Resource  subject   = stmt.getSubject();     // get the subject
	   	    Property  predicate = stmt.getPredicate();   // get the predicate
	   	    RDFNode   object    = stmt.getObject();      // get the object

	   	    System.out.print(subject.toString());
	   	    System.out.print(" " + predicate.toString() + " ");
	   	    if (object instanceof Resource) {
	   	       System.out.print(object.toString());
	   	    } else {
	   	        // object is a literal
	   	        System.out.print(" \"" + object.toString() + "\"");
	   	    }

	   	    System.out.println(" .");
	   	}
	   	
	   	System.out.println("______________");
	
	}
                     else if(user_query==3){
           
           System.out.println("Individual of Bank those offer loan: ");
	    	Object obj3= null;
	    	
			//getresource
	   	SimpleSelector sel3 = (SimpleSelector) new SimpleSelector(null, model.getProperty("http://www.semanticweb.org/ashfaqahmad/ontologies/2020/11/untitled-ontology-17#offers"), obj3);
	   	StmtIterator iter3 = model.listStatements(sel3);
	   	System.out.println("__________________");

	   	while (iter3.hasNext()) {
	   	    Statement stmt      = iter3.nextStatement();  // get next statement
	   	    Resource  subject   = stmt.getSubject();     // get the subject
	   	    Property  predicate = stmt.getPredicate();   // get the predicate
	   	    RDFNode   object    = stmt.getObject();      // get the object

	   	    System.out.print(subject.toString());
	   	    System.out.print(" " + predicate.toString() + " ");
	   	    if (object instanceof Resource) {
	   	       System.out.print(object.toString());
	   	    } else {
	   	        // object is a literal
	   	        System.out.print(" \"" + object.toString() + "\"");
	   	    }

	   	    System.out.println(" .");
	   	}
	   	
	   	System.out.println("______________");
	
	}
          
          
           else if(user_query==4){
               System.out.println("Individual of Loan which is offer by bank: ");
	    	Object obj4= null;
	    	
			//getresource
	   	SimpleSelector sel4 = (SimpleSelector) new SimpleSelector(null, model.getProperty("http://www.semanticweb.org/ashfaqahmad/ontologies/2020/11/untitled-ontology-17#isOfferedBy"), obj4);
	   	StmtIterator iter4 = model.listStatements(sel4);
	   	System.out.println("__________________");

	   	while (iter4.hasNext()) {
	   	    Statement stmt      = iter4.nextStatement();  // get next statement
	   	    Resource  subject   = stmt.getSubject();     // get the subject
	   	    Property  predicate = stmt.getPredicate();   // get the predicate
	   	    RDFNode   object    = stmt.getObject();      // get the object

	   	    System.out.print(subject.toString());
	   	    System.out.print(" " + predicate.toString() + " ");
	   	    if (object instanceof Resource) {
	   	       System.out.print(object.toString());
	   	    } else {
	   	        // object is a literal
	   	        System.out.print(" \"" + object.toString() + "\"");
	   	    }

	   	    System.out.println(" .");
	   	}
	   	
	   	System.out.println("______________");}
            else if(user_query==5){
                System.out.println("Individual of customers witch is facility of loan: ");
	    	Object obj5= null;
	    	
			//getresource
	   	SimpleSelector sel5 = (SimpleSelector) new SimpleSelector(null, model.getProperty("http://www.semanticweb.org/ashfaqahmad/ontologies/2020/11/untitled-ontology-17#hasFacilityOf"), obj5);
	   	StmtIterator iter5 = model.listStatements(sel5);
	   	System.out.println("__________________");

	   	while (iter5.hasNext()) {
	   	    Statement stmt      = iter5.nextStatement();  // get next statement
	   	    Resource  subject   = stmt.getSubject();     // get the subject
	   	    Property  predicate = stmt.getPredicate();   // get the predicate
	   	    RDFNode   object    = stmt.getObject();      // get the object

	   	    System.out.print(subject.toString());
	   	    System.out.print(" " + predicate.toString() + " ");
	   	    if (object instanceof Resource) {
	   	       System.out.print(object.toString());
	   	    } else {
	   	        // object is a literal
	   	        System.out.print(" \"" + object.toString() + "\"");
	   	    }

	   	    System.out.println(" .");
	   	}
	   	
	   	System.out.println("______________");}
            else if(user_query==6){
                System.out.println("Name of Banks: ");
	    	Object obj6= null;
	    	
			//getresource
	   	SimpleSelector sel6 = (SimpleSelector) new SimpleSelector(null, model.getProperty("http://www.semanticweb.org/ashfaqahmad/ontologies/2020/11/untitled-ontology-17#bankHasName"), obj6);
	   	StmtIterator iter6 = model.listStatements(sel6);
	   	System.out.println("__________________");

	   	while (iter6.hasNext()) {
	   	    Statement stmt      = iter6.nextStatement();  // get next statement
	   	    Resource  subject   = stmt.getSubject();     // get the subject
	   	    Property  predicate = stmt.getPredicate();   // get the predicate
	   	    RDFNode   object    = stmt.getObject();      // get the object

	   	    System.out.print(subject.toString());
	   	    System.out.print(" " + predicate.toString() + " ");
	   	    if (object instanceof Resource) {
	   	       System.out.print(object.toString());
	   	    } else {
	   	        // object is a literal
	   	        System.out.print(" \"" + object.toString() + "\"");
	   	    }

	   	    System.out.println(" .");
	   	}
	   	
	   	System.out.println("______________");}
            else{
                System.out.println("You enter wrong choice. Run progrom again>>>>");
                
            }

}}

//model.getProperty("http://www.semanticweb.org/ashfaqahmad/ontologies/2020/11/untitled-ontology-17#")