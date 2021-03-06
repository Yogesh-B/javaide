/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.layoutlib.api;

import org.xmlpull.v1.XmlPullParser;

/**
 * @deprecated
 */
@Deprecated
public interface IXmlPullParser extends XmlPullParser {

    /**
     * Returns a key for the current XML node.
     * <p/>This key will be passed back in the {@link com.android.ide.common.rendering.api.ViewInfo}
     * objects, allowing association of a particular XML node with its result from the
     * layout computation.
     */
    Object getViewKey();
}
