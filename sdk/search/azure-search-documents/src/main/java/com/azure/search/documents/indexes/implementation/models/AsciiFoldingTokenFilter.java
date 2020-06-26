// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The AsciiFoldingTokenFilter model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Azure.Search.AsciiFoldingTokenFilter")
@JsonFlatten
@Fluent
public class AsciiFoldingTokenFilter extends TokenFilter {
    /*
     * A value indicating whether the original token will be kept. Default is
     * false.
     */
    @JsonProperty(value = "preserveOriginal")
    private Boolean preserveOriginal;

    /**
     * Get the preserveOriginal property: A value indicating whether the original token will be kept. Default is false.
     *
     * @return the preserveOriginal value.
     */
    public Boolean isPreserveOriginal() {
        return this.preserveOriginal;
    }

    /**
     * Set the preserveOriginal property: A value indicating whether the original token will be kept. Default is false.
     *
     * @param preserveOriginal the preserveOriginal value to set.
     * @return the AsciiFoldingTokenFilter object itself.
     */
    public AsciiFoldingTokenFilter setPreserveOriginal(Boolean preserveOriginal) {
        this.preserveOriginal = preserveOriginal;
        return this;
    }
}
