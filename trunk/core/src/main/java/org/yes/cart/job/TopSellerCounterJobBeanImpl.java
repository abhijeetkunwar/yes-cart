package org.yes.cart.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.yes.cart.domain.entity.CustomerOrder;
import org.yes.cart.service.domain.CustomerOrderService;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
* User: Igor Azarny iazarny@yahoo.com
 * Date: 09-May-2011
 * Time: 14:12:54
 */
public class TopSellerCounterJobBeanImpl  extends QuartzJobBean{

    private static final Logger LOG = LoggerFactory.getLogger(TopSellerCounterJobBeanImpl.class);


    private CustomerOrderService customerOrderService;

    private int calculationPeriodInDays = 10;

    /** {@inheritDoc}*/
    protected void executeInternal(final JobExecutionContext jobExecutionContext) throws JobExecutionException {
        LOG.info(MessageFormat.format("TopSellerCounterJobBeanImpl start at {0}", new Date()));
        final Calendar calendar = Calendar.getInstance();
        calendar.add( Calendar.DAY_OF_MONTH, -1 *  calculationPeriodInDays);
        //List<CustomerOrder> orders = customerOrderService.findCustomerOrders(calendar.getTime());
        LOG.info(MessageFormat.format("TopSellerCounterJobBeanImpl   end at {0}", new Date()));
    }



    /**
     * IoC Authowire.
     * Set {@link org.yes.cart.service.domain.CustomerOrderService} to use
     *
     * @param customerOrderService service to use.
     */
    public void setCustomerOrderService(final CustomerOrderService customerOrderService) {
        this.customerOrderService = customerOrderService;
    }

    /**
     * IoC  Authowire.
     * @param calculationPeriodInDays  period for calclate top sellers.
     */
    public void setCalculationPeriodInDays(int calculationPeriodInDays) {
        this.calculationPeriodInDays = calculationPeriodInDays;
    }
}
