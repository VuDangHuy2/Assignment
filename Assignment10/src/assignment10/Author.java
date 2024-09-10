package assignment10;

import java.text.SimpleDateFormat;
import java.util.Date;

class Author {
    private String name;
    private Date dateOfBirth;
    
    public Author() {}
    
    public Author(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        return "Author's name: " + this.getName() + "\n Date of birth: " + sdf.format(this.dateOfBirth);
    }
}
