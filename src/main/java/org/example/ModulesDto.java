package org.example;


public class ModulesDto {
    public String name;
    public boolean isEnabled;
    public String user;
    public boolean isSubModule;

    public  ModulesDto (String name,boolean isEnabled,String user,boolean subModule){
        this.isEnabled=isEnabled;
        this.name=name;
        this.user=user;
        this.isSubModule =subModule;
    }

    public String getName(){
        return name;
    }
    public boolean isEnabled(){
        return isEnabled;
    }
    public boolean isSubModule(){
        return isSubModule;
    }
    public String getUser(){
        return user;
    }
    public void setEnabled(boolean enabled){
        isEnabled=enabled;
    }
    public void setSubModule(boolean enabled){
        isSubModule =enabled;
    }

}
