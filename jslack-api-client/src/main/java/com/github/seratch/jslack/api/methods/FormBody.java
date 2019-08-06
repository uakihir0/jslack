package com.github.seratch.jslack.api.methods;

import net.socialhub.http.HttpParameter;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class FormBody {
    private final List<String> names;
    private final List<Object> values;

    FormBody(List<String> names, List<Object> values) {
        this.names = names;
        this.values = values;
    }

    public int size() {
        return this.names.size();
    }

    public HttpParameter[] getParams() {
        HttpParameter[] result = new HttpParameter[size()];

        for (int i = 0; i < size(); i++) {
            if (values.get(i) instanceof String) {
                result[i] = new HttpParameter(names.get(i), (String) values.get(i));
            }
            if (values.get(i) instanceof File) {
                result[i] = new HttpParameter(names.get(i), (File) values.get(i));
            }

            if (values.get(i) instanceof StreamFile) {
                result[i] = new HttpParameter(names.get(i),
                        ((StreamFile) values.get(i)).getName(),
                        ((StreamFile) values.get(i)).getStream());
            }
        }
        return result;
    }

    public static final class StreamFile {
        private InputStream stream;
        private String name;

        public InputStream getStream() {
            return stream;
        }

        public void setStream(InputStream stream) {
            this.stream = stream;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static final class Builder {
        private final List<String> names;
        private final List<Object> values;
        private final Charset charset;
        private boolean includeFile = false;

        public Builder() {
            this((Charset) null);
        }

        public Builder(Charset charset) {
            this.names = new ArrayList<>();
            this.values = new ArrayList<>();
            this.charset = charset;
        }

        public Builder add(String name, Object value) {
            this.names.add(name);
            this.values.add(value);
            return this;
        }

        public Builder addFile(String name, File file) {
            this.includeFile = true;
            this.names.add(name);
            this.values.add(file);
            return this;
        }

        public Builder addFile(String name, InputStream fileBody, String fileName) {
            this.includeFile = true;
            this.names.add(name);
            StreamFile file = new StreamFile();
            file.setStream(fileBody);
            file.setName(fileName);
            this.values.add(file);
            return this;
        }

        public FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }
}
