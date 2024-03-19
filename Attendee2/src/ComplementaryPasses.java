public class ComplementaryPasses {
    public static final String getpassID = null;
    private String passID;
    private String accessLevel;

    public ComplementaryPasses(String passID,String accessLevel){
        this. passID=passID;
        this. accessLevel=accessLevel;

    }
    public void setpassID(String passID){
        this. passID=passID;

    }
    public String getpassID(){
        return passID;
    }
    public void setaccessLevel(String accessLevel){
        this.accessLevel=accessLevel;

    }
    public String getaccessLevel(){
        return accessLevel;
    }
    public String toString(){
        return"ComplementaryPasses{PassID='"+passID+"'accessLevel='"+accessLevel+"'}";
    }



    

}
