/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.module.extension.internal.metadata.extension.resolver;

import org.mule.api.connection.ConnectionException;
import org.mule.api.metadata.MetadataContext;
import org.mule.api.metadata.MetadataKey;
import org.mule.api.metadata.resolving.MetadataKeysResolver;
import org.mule.api.metadata.resolving.MetadataOutputResolver;
import org.mule.metadata.api.model.MetadataType;
import org.mule.module.extension.internal.metadata.TestMetadataUtils;

import java.util.List;

public class TestOutputResolverWithKeyResolver implements MetadataKeysResolver, MetadataOutputResolver
{

    @Override
    public List<MetadataKey> getMetadataKeys(MetadataContext context) throws ConnectionException
    {
        return TestMetadataUtils.getKeys(context);
    }

    @Override
    public MetadataType getOutputMetadata(MetadataContext context, MetadataKey key)
    {
        return TestMetadataUtils.getMetadata(key);
    }
}
