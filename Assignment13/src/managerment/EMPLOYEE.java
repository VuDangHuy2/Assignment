package managerment;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

abstract class EMPLOYEE implements IEMPLOYEE {

    Scanner scan = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String EmpID;
    private String EmpName;
    private Date EmpDateOfBirth;
    private Date StartDate;

    public EMPLOYEE() {
    }

    public EMPLOYEE(String EmpID, String EmpName, Date EmpDateOfBirth, Date StartDate) {
        this.EmpID = EmpID;
        this.EmpName = EmpName;
        this.EmpDateOfBirth = EmpDateOfBirth;
        this.StartDate = StartDate;
    }

    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public Date getEmpDateOfBirth() {
        return EmpDateOfBirth;
    }

    public void setEmpDateOfBirth(Date EmpDateOfBirth) {
        this.EmpDateOfBirth = EmpDateOfBirth;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    abstract void input();

    abstract void output(); 

    public int CalculateSeniority() {
        int yearNow = LocalDate.now().getYear();
        int seniority = yearNow - this.getStartDate().getYear();
        return seniority;
    }
}
