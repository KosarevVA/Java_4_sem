package Pr6.abstractFactory.enterprise;

import Pr6.abstractFactory.AgileTeamFactory;
import Pr6.abstractFactory.SoftwareDeveloper;
import Pr6.abstractFactory.ProductManager;

public class EnterpriseTeam implements AgileTeamFactory {
    @Override
    public ProductManager getProductManager() {
        return new EnterpriseProductManager();
    }

    @Override
    public SoftwareDeveloper getSoftwareDeveloper() {
        return new EnterpriseSoftwareDeveloper();
    }
}
