/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.craftercms.security.utils.spring;

import org.craftercms.security.utils.SecurityEnabledAware;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * {@link BeanPostProcessor} implementation that passes the {@code securityEnabled} property to beans that
 * implement the {@link SecurityEnabledAware} interface.
 *
 * @author Alfonso Vásquez
 */
public class SecurityEnabledAwareProcessor implements BeanPostProcessor {

    private boolean securityEnabled;

    public SecurityEnabledAwareProcessor(boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof SecurityEnabledAware) {
            ((SecurityEnabledAware) bean).setSecurityEnabled(securityEnabled);
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}
