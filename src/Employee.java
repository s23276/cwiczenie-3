public class Employee
{
    private String firstName;

    private String lastName;

    private String pesel;

    private String email;

    private int employmentYear;


    public Employee(String firstName,String lastName, String PESEL, String email, int employmentYear )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.pesel = PESEL;
        this.employmentYear = employmentYear;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public void setEmploymentYear(int employmentYear) {
        this.employmentYear = employmentYear;
    }


    public void calculateSalary(int pensjaPodstawowa) {
        pensjaPodstawowa=3000;
        int pensjaOstateczna= pensjaPodstawowa + (employmentYear*1000);
    }



}

