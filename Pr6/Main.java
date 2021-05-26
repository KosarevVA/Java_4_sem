package Pr6;

import Pr6.abstractFactory.AgileTeamFactory;
import Pr6.abstractFactory.ProductManager;
import Pr6.abstractFactory.SoftwareDeveloper;
import Pr6.abstractFactory.enterprise.EnterpriseTeam;
import Pr6.builder.AnalyticsTeam;
import Pr6.builder.ProjectManager;
import Pr6.factory.AgileFramework;
import Pr6.factory.AgileFrameworkFactory;
import Pr6.prototype.Branch;

public class Main {

    public static void main(String[] args) {
        System.out.println("Тест. метода 'фабрика'");
        AgileFramework scrum =
                AgileFrameworkFactory.getAgileFramework(AgileFramework.AgileType.SCRUM);
        AgileFramework kanban =
                AgileFrameworkFactory.getAgileFramework(AgileFramework.AgileType.KANBAN);
        scrum.startDevelopment();
        kanban.startDevelopment();

        System.out.println("\nТест. метода 'абстрактная фабрика'");
        AgileTeamFactory agileTeam = new EnterpriseTeam();
        ProductManager pm = agileTeam.getProductManager();
        SoftwareDeveloper sd = agileTeam.getSoftwareDeveloper();
        pm.manage();
        sd.develop();

        System.out.println("\nТест. метода 'строитель'");
        ProjectManager projectManager = new ProjectManager(new AnalyticsTeam());
        System.out.println(projectManager.setTeam());

        System.out.println("\nТест. метода 'прототип'");
        Branch branch1 = new Branch("master", 247);
        System.out.println("Source: " + branch1);
        Branch branch2 = (Branch) branch1.prototype();
        System.out.println("Copy: " + branch2);
    }
}