package module_2_apj.service.customer;

import module_2_apj.service.ISevrice;

public interface ICustomerServive extends ISevrice {
    @Override
    void display();

    @Override
    void add();

    @Override
    void update();

    @Override
    void delete();
}
