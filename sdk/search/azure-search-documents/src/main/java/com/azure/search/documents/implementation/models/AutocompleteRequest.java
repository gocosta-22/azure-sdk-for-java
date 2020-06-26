// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AutocompleteRequest model. */
@Fluent
public final class AutocompleteRequest {
    /*
     * The search text on which to base autocomplete results.
     */
    @JsonProperty(value = "search", required = true)
    private String searchText;

    /*
     * Specifies the mode for Autocomplete. The default is 'oneTerm'. Use
     * 'twoTerms' to get shingles and 'oneTermWithContext' to use the current
     * context while producing auto-completed terms.
     */
    @JsonProperty(value = "autocompleteMode")
    private AutocompleteMode autocompleteMode;

    /*
     * An OData expression that filters the documents used to produce completed
     * terms for the Autocomplete result.
     */
    @JsonProperty(value = "filter")
    private String filter;

    /*
     * A value indicating whether to use fuzzy matching for the autocomplete
     * query. Default is false. When set to true, the query will autocomplete
     * terms even if there's a substituted or missing character in the search
     * text. While this provides a better experience in some scenarios, it
     * comes at a performance cost as fuzzy autocomplete queries are slower and
     * consume more resources.
     */
    @JsonProperty(value = "fuzzy")
    private Boolean useFuzzyMatching;

    /*
     * A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting is disabled.
     */
    @JsonProperty(value = "highlightPostTag")
    private String highlightPostTag;

    /*
     * A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting is disabled.
     */
    @JsonProperty(value = "highlightPreTag")
    private String highlightPreTag;

    /*
     * A number between 0 and 100 indicating the percentage of the index that
     * must be covered by an autocomplete query in order for the query to be
     * reported as a success. This parameter can be useful for ensuring search
     * availability even for services with only one replica. The default is 80.
     */
    @JsonProperty(value = "minimumCoverage")
    private Double minimumCoverage;

    /*
     * The comma-separated list of field names to consider when querying for
     * auto-completed terms. Target fields must be included in the specified
     * suggester.
     */
    @JsonProperty(value = "searchFields")
    private String searchFields;

    /*
     * The name of the suggester as specified in the suggesters collection
     * that's part of the index definition.
     */
    @JsonProperty(value = "suggesterName", required = true)
    private String suggesterName;

    /*
     * The number of auto-completed terms to retrieve. This must be a value
     * between 1 and 100. The default is 5.
     */
    @JsonProperty(value = "top")
    private Integer top;

    /**
     * Get the searchText property: The search text on which to base autocomplete results.
     *
     * @return the searchText value.
     */
    public String getSearchText() {
        return this.searchText;
    }

    /**
     * Set the searchText property: The search text on which to base autocomplete results.
     *
     * @param searchText the searchText value to set.
     * @return the AutocompleteRequest object itself.
     */
    public AutocompleteRequest setSearchText(String searchText) {
        this.searchText = searchText;
        return this;
    }

    /**
     * Get the autocompleteMode property: Specifies the mode for Autocomplete. The default is 'oneTerm'. Use 'twoTerms'
     * to get shingles and 'oneTermWithContext' to use the current context while producing auto-completed terms.
     *
     * @return the autocompleteMode value.
     */
    public AutocompleteMode getAutocompleteMode() {
        return this.autocompleteMode;
    }

    /**
     * Set the autocompleteMode property: Specifies the mode for Autocomplete. The default is 'oneTerm'. Use 'twoTerms'
     * to get shingles and 'oneTermWithContext' to use the current context while producing auto-completed terms.
     *
     * @param autocompleteMode the autocompleteMode value to set.
     * @return the AutocompleteRequest object itself.
     */
    public AutocompleteRequest setAutocompleteMode(AutocompleteMode autocompleteMode) {
        this.autocompleteMode = autocompleteMode;
        return this;
    }

    /**
     * Get the filter property: An OData expression that filters the documents used to produce completed terms for the
     * Autocomplete result.
     *
     * @return the filter value.
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: An OData expression that filters the documents used to produce completed terms for the
     * Autocomplete result.
     *
     * @param filter the filter value to set.
     * @return the AutocompleteRequest object itself.
     */
    public AutocompleteRequest setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the useFuzzyMatching property: A value indicating whether to use fuzzy matching for the autocomplete query.
     * Default is false. When set to true, the query will autocomplete terms even if there's a substituted or missing
     * character in the search text. While this provides a better experience in some scenarios, it comes at a
     * performance cost as fuzzy autocomplete queries are slower and consume more resources.
     *
     * @return the useFuzzyMatching value.
     */
    public Boolean isUseFuzzyMatching() {
        return this.useFuzzyMatching;
    }

    /**
     * Set the useFuzzyMatching property: A value indicating whether to use fuzzy matching for the autocomplete query.
     * Default is false. When set to true, the query will autocomplete terms even if there's a substituted or missing
     * character in the search text. While this provides a better experience in some scenarios, it comes at a
     * performance cost as fuzzy autocomplete queries are slower and consume more resources.
     *
     * @param useFuzzyMatching the useFuzzyMatching value to set.
     * @return the AutocompleteRequest object itself.
     */
    public AutocompleteRequest setUseFuzzyMatching(Boolean useFuzzyMatching) {
        this.useFuzzyMatching = useFuzzyMatching;
        return this;
    }

    /**
     * Get the highlightPostTag property: A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting is disabled.
     *
     * @return the highlightPostTag value.
     */
    public String getHighlightPostTag() {
        return this.highlightPostTag;
    }

    /**
     * Set the highlightPostTag property: A string tag that is appended to hit highlights. Must be set with
     * highlightPreTag. If omitted, hit highlighting is disabled.
     *
     * @param highlightPostTag the highlightPostTag value to set.
     * @return the AutocompleteRequest object itself.
     */
    public AutocompleteRequest setHighlightPostTag(String highlightPostTag) {
        this.highlightPostTag = highlightPostTag;
        return this;
    }

    /**
     * Get the highlightPreTag property: A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting is disabled.
     *
     * @return the highlightPreTag value.
     */
    public String getHighlightPreTag() {
        return this.highlightPreTag;
    }

    /**
     * Set the highlightPreTag property: A string tag that is prepended to hit highlights. Must be set with
     * highlightPostTag. If omitted, hit highlighting is disabled.
     *
     * @param highlightPreTag the highlightPreTag value to set.
     * @return the AutocompleteRequest object itself.
     */
    public AutocompleteRequest setHighlightPreTag(String highlightPreTag) {
        this.highlightPreTag = highlightPreTag;
        return this;
    }

    /**
     * Get the minimumCoverage property: A number between 0 and 100 indicating the percentage of the index that must be
     * covered by an autocomplete query in order for the query to be reported as a success. This parameter can be useful
     * for ensuring search availability even for services with only one replica. The default is 80.
     *
     * @return the minimumCoverage value.
     */
    public Double getMinimumCoverage() {
        return this.minimumCoverage;
    }

    /**
     * Set the minimumCoverage property: A number between 0 and 100 indicating the percentage of the index that must be
     * covered by an autocomplete query in order for the query to be reported as a success. This parameter can be useful
     * for ensuring search availability even for services with only one replica. The default is 80.
     *
     * @param minimumCoverage the minimumCoverage value to set.
     * @return the AutocompleteRequest object itself.
     */
    public AutocompleteRequest setMinimumCoverage(Double minimumCoverage) {
        this.minimumCoverage = minimumCoverage;
        return this;
    }

    /**
     * Get the searchFields property: The comma-separated list of field names to consider when querying for
     * auto-completed terms. Target fields must be included in the specified suggester.
     *
     * @return the searchFields value.
     */
    public String getSearchFields() {
        return this.searchFields;
    }

    /**
     * Set the searchFields property: The comma-separated list of field names to consider when querying for
     * auto-completed terms. Target fields must be included in the specified suggester.
     *
     * @param searchFields the searchFields value to set.
     * @return the AutocompleteRequest object itself.
     */
    public AutocompleteRequest setSearchFields(String searchFields) {
        this.searchFields = searchFields;
        return this;
    }

    /**
     * Get the suggesterName property: The name of the suggester as specified in the suggesters collection that's part
     * of the index definition.
     *
     * @return the suggesterName value.
     */
    public String getSuggesterName() {
        return this.suggesterName;
    }

    /**
     * Set the suggesterName property: The name of the suggester as specified in the suggesters collection that's part
     * of the index definition.
     *
     * @param suggesterName the suggesterName value to set.
     * @return the AutocompleteRequest object itself.
     */
    public AutocompleteRequest setSuggesterName(String suggesterName) {
        this.suggesterName = suggesterName;
        return this;
    }

    /**
     * Get the top property: The number of auto-completed terms to retrieve. This must be a value between 1 and 100. The
     * default is 5.
     *
     * @return the top value.
     */
    public Integer getTop() {
        return this.top;
    }

    /**
     * Set the top property: The number of auto-completed terms to retrieve. This must be a value between 1 and 100. The
     * default is 5.
     *
     * @param top the top value to set.
     * @return the AutocompleteRequest object itself.
     */
    public AutocompleteRequest setTop(Integer top) {
        this.top = top;
        return this;
    }
}
