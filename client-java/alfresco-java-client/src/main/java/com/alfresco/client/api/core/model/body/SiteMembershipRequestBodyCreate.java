/*
 *   Copyright (C) 2005-2016 Alfresco Software Limited.
 *
 *   This file is part of Alfresco Java Client.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.alfresco.client.api.core.model.body;

/**
 * Created by jpascal on 15/12/2015.
 */
public class SiteMembershipRequestBodyCreate
{
    public final String id;

    public final String message;

    public final String title;

    public SiteMembershipRequestBodyCreate(String id)
    {
        this.id = id;
        this.message = null;
        this.title = null;
    }

    public SiteMembershipRequestBodyCreate(String id, String message, String title)
    {
        this.id = id;
        this.message = message;
        this.title = title;
    }

}
