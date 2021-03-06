/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.math.stat.descriptive;

import java.io.Serializable;

/**
 * Provides a default {@link SummaryStatistics} implementation.
 * 
 * @deprecated to be removed in commons math 2.0.  Use {@link SummaryStatistics}.
 * @version $Revision: 613677 $ $Date: 2008-01-20 14:08:35 -0700 (Sun, 20 Jan 2008) $  
 */
public class SummaryStatisticsImpl extends SummaryStatistics implements Serializable {

    /** Serializable version identifier */
    private static final long serialVersionUID = 8528794411480425963L;

    /**
     * Construct a SummaryStatistics
     */
    public SummaryStatisticsImpl() {
        super();
    }

    /** Resets all statistics and storage. */
    public void clear() {
        super.clear();
    }

}