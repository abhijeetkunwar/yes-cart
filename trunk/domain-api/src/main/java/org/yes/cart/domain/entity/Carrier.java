/*
 * Copyright 2009 Igor Azarnyi, Denys Pavlov
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.yes.cart.domain.entity;

import java.util.Collection;

/**
 * Present carrier / shipper entity.
 * User: Igor Azarny iazarny@yahoo.com
 * Date: 07-May-2011
 * Time: 11:12:54
 */
public interface Carrier extends Auditable {

    /**
     * Get pk value.
     *
     * @return pk value.
     */
    long getCarrierId();

    /**
     * Set pk value.
     *
     * @param carrierId pk value.
     */
    void setCarrierId(long carrierId);

    /**
     * Get carrier name.
     *
     * @return carrier name
     */
    String getName();

    /**
     * Set carrier name.
     *
     * @param name name to set.
     */
    void setName(String name);

    /**
     * Get carrier description.
     *
     * @return description
     */
    String getDescription();

    /**
     * Set carrier description.
     *
     * @param description description
     */
    void setDescription(String description);

    /**
     * Get the list of carrier SLAs.
     *
     * @return carrier SLAs
     */
    Collection<CarrierSla> getCarrierSla();

    /**
     * Set carrier SLAs
     *
     * @param carrierSla SLA to set.
     */
    void setCarrierSla(Collection<CarrierSla> carrierSla);


    /**
     * Is carrier perform world wide devilery.
     *
     * @return true if performs delivery.
     */
    boolean isWorldwide();

    /**
     * Set world wide delivery flag.
     *
     * @param worldwide world wide delivery flag
     */
    void setWorldwide(boolean worldwide);

    /**
     * Is carrier perform country devilery.
     *
     * @return true if performs country delivery.
     */
    boolean isCountry();

    /**
     * Set country delivery flag.
     *
     * @param country country delivery flag.
     */
    void setCountry(boolean country);

    /**
     * Is carrier perform state devilery.
     *
     * @return true if performs state delivery.
     */

    boolean isState();

    /**
     * Set state devivery flag.
     *
     * @param state state devivery flag
     */
    void setState(boolean state);

    /**
     * Is carrier perform local (city) devilery.
     *
     * @return true if performs local (city)  delivery.
     */

    boolean isLocal();

    /**
     * Set local delivery flag.
     *
     * @param local local delivery flag.
     */
    void setLocal(boolean local);


}

