/*
 * Copyright 2010 Alibaba Group Holding Limited.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.alibaba.citrus.webx.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class WebxUtilTests {
    @Test
    public void getRevision() {
        String revision = WebxUtil.getRevision();
        assertNotNull(revision);
        assertTrue("Please submit WebxUtil.java to subversion and set a property on the file: "
                + "svn ps svn:keywords Revision WebxUtil.java", revision.matches("Revision: \\d+"));
    }

    @Test
    public void getVersion() throws Exception {
        assertEquals(WebxUtil.getRevision(), WebxUtil.getWebxVersion());
    }
}
