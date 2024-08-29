package com.gentech.inheritance;

class Emp {
    Emp(String ename, String jobname) {
        System.out.println("Employee Name :" + ename);
        System.out.println("Employee Job :" + jobname);
    }
}

 class Dept extends Emp {
    String deptName;
    Dept() {
        super("Santosh", "Manager");
        deptName = "Accounting";
        System.out.println("Department :" + deptName);
    }
}

 class Proj extends Emp {
    String projectName;
    Proj() {
        super("Santosh", "Manager");
        projectName = "ProjectA";
        System.out.println("Project :" + projectName);
    }
}

 class ProjectType extends Proj {
    String projectType;
    ProjectType() {
        super();  
        projectType = "A";
        System.out.println("Project Type :" + projectType);
    }
}
public class Hybrid {

    public static void main(String[] args) {
        Dept dept = new Dept();
        ProjectType projecttype = new ProjectType();
    }
}
