package com.github.seratch.jslack.common.http;


import net.socialhub.http.HttpParameter;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class FormBody {
    private final List<String> names;
    private final List<String> values;

    FormBody(List<String> names, List<String> values) {
        this.names = names;
        this.values = values;
    }

    public int size() {
        return this.names.size();
    }

    public HttpParameter[] getParams() {
        HttpParameter[] result = new HttpParameter[size()];
        for (int i = 0; i < size(); i++) {
            result[i] = new HttpParameter(names.get(i), values.get(i));
        }
        return result;
    }


    public static final class Builder {
        private final List<String> names;
        private final List<String> values;
        private final Charset charset;

        public Builder() {
            this((Charset) null);
        }

        public Builder(Charset charset) {
            this.names = new ArrayList<>();
            this.values = new ArrayList<>();
            this.charset = charset;
        }

        public Builder add(String name, String value) {
            this.names.add(name);
            this.values.add(value);
            return this;
        }


        public FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }
}
