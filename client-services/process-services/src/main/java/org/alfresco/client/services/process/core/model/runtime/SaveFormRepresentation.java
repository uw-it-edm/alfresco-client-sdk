/*
 *  Copyright (C) 2005-2016 Alfresco Software Limited.
 *
 *  This file is part of Alfresco Activiti Client.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.alfresco.client.services.process.core.model.runtime;

import java.util.Map;

/**
 * Created by jpascal on 09/06/2015.
 */
public class SaveFormRepresentation
{
    private Map<String, Object> values;

    public SaveFormRepresentation(Map<String, Object> values)
    {
        this.values = values;
    }

    public Map<String, Object> getValues()
    {
        return values;
    }

    public void setValues(Map<String, Object> values)
    {
        this.values = values;
    }
}