
package plans.impl;

import java.util.Date;

/**
 * You are not required to make any modifications to this code.
 * Just use it in order to populate the stack.
 * 
 * @author Bolatzhan Kumalakov
 */
public class Change {
    
    //define fields
    private Date date;
    private String description;
    private String author;
    private int year, month, day;
    
    /**
     * Constructor relies on getting all values in order to instanciate
     * the object.
     * 
     * @param date
     * @param description
     * @param author 
     */
    public Change(Date date, String description, String author){
        this.author = author;
        this.date = date;
        this.description = description;
    }

    
    /**
     * Field getters and setters
     * 
     * @return corresponding field value
     */
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
  
    public int getYear(){
        return year;
    }
    
     
    public int getMonth(){
        return month;
    }
    
     
    public int getDay(){
        return day;
    }
    
    @Override
    public String toString(){
        
        Date d = getDate();
        
        return "  Dates: " + d.getYear() + "/"+ d.getMonth() + "/" + d.getDay() + "  Name: "+ author + "   Description: " + description;
    }
    
}
