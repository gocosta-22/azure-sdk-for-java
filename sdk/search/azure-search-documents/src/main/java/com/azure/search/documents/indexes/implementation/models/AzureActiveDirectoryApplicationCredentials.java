// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.indexes.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureActiveDirectoryApplicationCredentials model. */
@Fluent
public final class AzureActiveDirectoryApplicationCredentials {
    /*
     * An AAD Application ID that was granted the required access permissions
     * to the Azure Key Vault that is to be used when encrypting your data at
     * rest. The Application ID should not be confused with the Object ID for
     * your AAD Application.
     */
    @JsonProperty(value = "applicationId", required = true)
    private String applicationId;

    /*
     * The authentication key of the specified AAD application.
     */
    @JsonProperty(value = "applicationSecret")
    private String applicationSecret;

    /**
     * Get the applicationId property: An AAD Application ID that was granted the required access permissions to the
     * Azure Key Vault that is to be used when encrypting your data at rest. The Application ID should not be confused
     * with the Object ID for your AAD Application.
     *
     * @return the applicationId value.
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: An AAD Application ID that was granted the required access permissions to the
     * Azure Key Vault that is to be used when encrypting your data at rest. The Application ID should not be confused
     * with the Object ID for your AAD Application.
     *
     * @param applicationId the applicationId value to set.
     * @return the AzureActiveDirectoryApplicationCredentials object itself.
     */
    public AzureActiveDirectoryApplicationCredentials setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the applicationSecret property: The authentication key of the specified AAD application.
     *
     * @return the applicationSecret value.
     */
    public String getApplicationSecret() {
        return this.applicationSecret;
    }

    /**
     * Set the applicationSecret property: The authentication key of the specified AAD application.
     *
     * @param applicationSecret the applicationSecret value to set.
     * @return the AzureActiveDirectoryApplicationCredentials object itself.
     */
    public AzureActiveDirectoryApplicationCredentials setApplicationSecret(String applicationSecret) {
        this.applicationSecret = applicationSecret;
        return this;
    }
}
