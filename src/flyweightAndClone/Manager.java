package flyweightAndClone;

public class Manager implements Employee,Cloneable{
    @Override
    public void report() {
        System.out.println(reportContent);
    }

    private String department;   //外部状态 依赖外部
    private String reportContent;
    private String title = "部门经理";  //内部状态

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
    public Employee clone() throws CloneNotSupportedException{
        return (Employee) super.clone();
    }
}
