public class Performance {
    private String performanceID;
    private String performanceName;
    private String performanceLeadName;
    private char performanceGroup;
    public Performance(String performanceID,String performanceName,String performanceLeadName,char performanceGroup){
        this.performanceID  = performanceID;   
        this.performanceName = performanceName;
        this.performanceLeadName = performanceLeadName;
        this.performanceGroup = performanceGroup;                

    }
    public String getPerformanceID(){
        return performanceID;
    }
    public void setPerformanceID(){
        this.performanceID = performanceID;
    }
    public String getPerformanceName(){
        return performanceName;

    }
    public void setPerformanceName(){
        this.performanceName = performanceName;
    }
    public String getPerformanceLeadName(){
        return performanceLeadName;
    }
    public void setPerformanceLeadName(){
        this.performanceLeadName=performanceLeadName;

    }
    public int getPerformanceGroup(){
        return performanceGroup;
    }
    public void setPerformanceGroup(char performanceGroup){
        this.performanceGroup = performanceGroup;
    }
    public String toString(){
        return "PerformanceID: " + performanceID + "\n" + "PerformanceName: " + performanceName + "\n" + "PerformanceLeadName: " + performanceLeadName + "\n" + "PerformanceGroup: " + performanceGroup + "\n";

    }


}
