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
// Generated 25-Sep-2009 4:08:12 PM by Hibernate Tools 3.2.2.GA


/**
 * ShopDiscountRule generated by hbm2java
 */

public interface ShopDiscountRule extends Auditable {

    /**
     */
    long getShopDiscountRuleId();

    void setShopDiscountRuleId(long shopDiscountRuleId);

    /**
     */
    String getRule();

    void setRule(String rule);

    /**
     */
    String getName();

    void setName(String name);

    /**
     */
    String getDescription();

    void setDescription(String description);

}

