/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.prove.proveapi.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.prove.proveapi.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class AdverseMediaResponse {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Date")
    private Optional<? extends String> date;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Snippet")
    private Optional<? extends String> snippet;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Title")
    private Optional<? extends String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Url")
    private Optional<? extends String> url;

    @JsonCreator
    public AdverseMediaResponse(
            @JsonProperty("Date") Optional<? extends String> date,
            @JsonProperty("Snippet") Optional<? extends String> snippet,
            @JsonProperty("Title") Optional<? extends String> title,
            @JsonProperty("Url") Optional<? extends String> url) {
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(snippet, "snippet");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(url, "url");
        this.date = date;
        this.snippet = snippet;
        this.title = title;
        this.url = url;
    }
    
    public AdverseMediaResponse() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> date() {
        return (Optional<String>) date;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> snippet() {
        return (Optional<String>) snippet;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> title() {
        return (Optional<String>) title;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> url() {
        return (Optional<String>) url;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AdverseMediaResponse withDate(String date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.ofNullable(date);
        return this;
    }

    public AdverseMediaResponse withDate(Optional<? extends String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    public AdverseMediaResponse withSnippet(String snippet) {
        Utils.checkNotNull(snippet, "snippet");
        this.snippet = Optional.ofNullable(snippet);
        return this;
    }

    public AdverseMediaResponse withSnippet(Optional<? extends String> snippet) {
        Utils.checkNotNull(snippet, "snippet");
        this.snippet = snippet;
        return this;
    }

    public AdverseMediaResponse withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public AdverseMediaResponse withTitle(Optional<? extends String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public AdverseMediaResponse withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = Optional.ofNullable(url);
        return this;
    }

    public AdverseMediaResponse withUrl(Optional<? extends String> url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdverseMediaResponse other = (AdverseMediaResponse) o;
        return 
            java.util.Objects.deepEquals(this.date, other.date) &&
            java.util.Objects.deepEquals(this.snippet, other.snippet) &&
            java.util.Objects.deepEquals(this.title, other.title) &&
            java.util.Objects.deepEquals(this.url, other.url);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            date,
            snippet,
            title,
            url);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AdverseMediaResponse.class,
                "date", date,
                "snippet", snippet,
                "title", title,
                "url", url);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> date = Optional.empty();
 
        private Optional<? extends String> snippet = Optional.empty();
 
        private Optional<? extends String> title = Optional.empty();
 
        private Optional<? extends String> url = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder date(String date) {
            Utils.checkNotNull(date, "date");
            this.date = Optional.ofNullable(date);
            return this;
        }

        public Builder date(Optional<? extends String> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        public Builder snippet(String snippet) {
            Utils.checkNotNull(snippet, "snippet");
            this.snippet = Optional.ofNullable(snippet);
            return this;
        }

        public Builder snippet(Optional<? extends String> snippet) {
            Utils.checkNotNull(snippet, "snippet");
            this.snippet = snippet;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<? extends String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = Optional.ofNullable(url);
            return this;
        }

        public Builder url(Optional<? extends String> url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }
        
        public AdverseMediaResponse build() {
            return new AdverseMediaResponse(
                date,
                snippet,
                title,
                url);
        }
    }
}

