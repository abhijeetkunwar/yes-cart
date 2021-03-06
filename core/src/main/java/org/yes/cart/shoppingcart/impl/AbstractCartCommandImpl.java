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

package org.yes.cart.shoppingcart.impl;

import org.yes.cart.shoppingcart.MutableShoppingCart;
import org.yes.cart.shoppingcart.ShoppingCart;
import org.yes.cart.shoppingcart.ShoppingCartCommand;
import org.yes.cart.shoppingcart.ShoppingCartCommandRegistry;

import java.util.Map;

/**
 * User: Igor Azarny iazarny@yahoo.com
 * Date: 09-May-2011
 * Time: 13:16
 */
public abstract class AbstractCartCommandImpl implements ShoppingCartCommand {

    private int priority = 0;

    /**
     * Construct command.
     *
     * @param registry shopping cart command registry
     */
    protected AbstractCartCommandImpl(final ShoppingCartCommandRegistry registry) {
        registry.registerCommand(this);
    }

    public final void execute(final ShoppingCart shoppingCart, final Map<String, Object> parameters) {
        // OOTB we only have mutable cart
        execute((MutableShoppingCart) shoppingCart, parameters);
    }

    /**
     * Internal hook to switch to mutable cart.
     *
     * @param shoppingCart mutable cart
     * @param parameters   parameters
     */
    public abstract void execute(final MutableShoppingCart shoppingCart, final Map<String, Object> parameters);

    /**
     * Recalculate shopping cart.
     *
     * @param shoppingCart current cart
     */
    protected void recalculate(final MutableShoppingCart shoppingCart) {
        shoppingCart.recalculate();
    }

    /**
     * Mark shopping cart dirty and thus eligible for persistence.
     *
     * @param shoppingCart current cart
     */
    protected void markDirty(final MutableShoppingCart shoppingCart) {
        shoppingCart.markDirty();
    }

    /** {@inheritDoc} */
    public int getPriority() {
        return priority;
    }

    /**
     * IoC priority for command.
     *
     * @param priority see {@link #getPriority()}
     */
    public void setPriority(final int priority) {
        this.priority = priority;
    }

}
