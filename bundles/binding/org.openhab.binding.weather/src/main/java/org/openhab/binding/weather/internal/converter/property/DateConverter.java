/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.weather.internal.converter.property;

import org.openhab.binding.weather.internal.converter.ConverterType;

/**
 * Date converter with a yyyy-MM-dd pattern.
 *
 * @author Gerhard Riegler
 * @since 1.6.0
 */
public class DateConverter extends AbstractDateConverter {
    private static final String DATE_PATTERN = "yyyy-MM-dd";

    public DateConverter() {
        super(DATE_PATTERN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConverterType getType() {
        return ConverterType.DATE;
    }

}
