package in.smarprogramming.SpringJdbcCrudOperation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.Student;
import in.sp.mapper.StudentRowMapper;
import in.sp.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        
        
        //------------------------Insert Operation-------------------------------------
//        int std_rollNo=121;
//    	String std_name = "Rao";
//    	float std_marks = 88.67f;
//        String insert_sql_query= "INSERT INTO student VALUES (?, ?, ?)";
//        int count = jdbcTemplate.update(insert_sql_query, std_rollNo, std_name, std_marks);
//        
//        if(count==1) {
//        	System.out.println("Insertion Success");
//        }else {
//        	System.out.println("insertion Failed");
//        }
        
        //--------------------------Update Operation-----------------------
//    
//        float std_marks = 88.98f;
//        int rollNo = 101;
//        
//        String update_sql_query = "UPDATE student SET std_marks=? where std_roll =?";
//        int count = jdbcTemplate.update(update_sql_query, std_marks, rollNo);
//        if(count==1) {
//        	System.out.println("Updation Success");
//        }else {
//        	System.out.println("Updation Failed");
//        }
//    
        
        //-----------------------------Delete Operation----------------------------
        
//        int rollNo =101;
//        
//        String delete_sql_query = "DELETE FROM student WHERE std_roll =?";
//        int count = jdbcTemplate.update(delete_sql_query, rollNo);
//        if(count==1) {
//        	System.out.println("Deletion Success");
//        }else {
//        	System.out.println("Deletion Failed");
//        }
//        	
        
        // ---------------------------Select Operation-------------------------]
        
        String select_sql_query = "SELECT * FROM STUDENT";
        List<Student> std_list= jdbcTemplate.query(select_sql_query, new StudentRowMapper());
        
        for(Student std: std_list) {
        	System.out.println("Roll no : "+std.getRollNo());
        	System.out.println("Name : "+std.getName());
        	System.out.println("Marks : "+std.getMarks());
        	System.out.println("--------------------------------------------");
        	System.out.println();
        }
        
        
    }
}
