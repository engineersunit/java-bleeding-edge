
class Employee extend Response{
    private String name;
    private String country;
    private double salary;
    private int zipCode;

    Employee(String name, String country, double salary, int zipCode){
            this.name = name;
            //
    }
}

class EmployeesService{

    private static final GET_QUERY = 
    "select emp_name, country, salary, zip_code from employees where name= :1";
    private Connection getConnnectionDB(){
        //jdbc
        return null;
    }
    
    @Get
    public List<Employees> getEmployees(@parameter String name){
       try(ResultSet rsEmpList =   getConnnectionDB().executeQuery(GET_QUERY, Object[]{name});){
       List <Employees> resultList = new ArrayList<Employees>();
       for (EmployeeResult e : rsEmpList.getInterator){
            Employee emp = new Employee(e.getName(), ..);
            resultList.add(emp);
       }
    }catch(){

    }finally{
        
    }

       return resultList;
    }

    

}
