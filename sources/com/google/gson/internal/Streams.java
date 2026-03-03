package com.google.gson.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class Streams {
    private Streams() {
        throw new UnsupportedOperationException();
    }

    public static JsonElement parse(JsonReader jsonReader) throws JsonParseException {
        boolean z5;
        try {
            try {
                jsonReader.peek();
                z5 = false;
                try {
                    return TypeAdapters.JSON_ELEMENT.read(jsonReader);
                } catch (EOFException e5) {
                    e = e5;
                    if (z5) {
                        return JsonNull.INSTANCE;
                    }
                    throw new JsonSyntaxException(e);
                }
            } catch (MalformedJsonException e6) {
                throw new JsonSyntaxException(e6);
            } catch (IOException e7) {
                throw new JsonIOException(e7);
            } catch (NumberFormatException e8) {
                throw new JsonSyntaxException(e8);
            }
        } catch (EOFException e9) {
            e = e9;
            z5 = true;
        }
    }

    public static void write(JsonElement jsonElement, JsonWriter jsonWriter) throws IOException {
        TypeAdapters.JSON_ELEMENT.write(jsonWriter, jsonElement);
    }

    public static Writer writerForAppendable(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new AppendableWriter(appendable);
    }

    private static final class AppendableWriter extends Writer {
        private final Appendable appendable;
        private final CurrentWrite currentWrite = new CurrentWrite();

        static class CurrentWrite implements CharSequence {
            char[] chars;

            CurrentWrite() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i5) {
                return this.chars[i5];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.chars.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i5, int i6) {
                return new String(this.chars, i5, i6 - i5);
            }
        }

        AppendableWriter(Appendable appendable) {
            this.appendable = appendable;
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i5, int i6) throws IOException {
            CurrentWrite currentWrite = this.currentWrite;
            currentWrite.chars = cArr;
            this.appendable.append(currentWrite, i5, i6 + i5);
        }

        @Override // java.io.Writer
        public void write(int i5) throws IOException {
            this.appendable.append((char) i5);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }
}
