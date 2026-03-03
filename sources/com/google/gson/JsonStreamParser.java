package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class JsonStreamParser implements Iterator<JsonElement> {
    private final Object lock;
    private final JsonReader parser;

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z5;
        synchronized (this.lock) {
            try {
                try {
                    try {
                        z5 = this.parser.peek() != JsonToken.END_DOCUMENT;
                    } catch (MalformedJsonException e5) {
                        throw new JsonSyntaxException(e5);
                    }
                } catch (IOException e6) {
                    throw new JsonIOException(e6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.parser = jsonReader;
        jsonReader.setLenient(true);
        this.lock = new Object();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public JsonElement next() throws JsonParseException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        try {
            return Streams.parse(this.parser);
        } catch (JsonParseException e5) {
            if (e5.getCause() instanceof EOFException) {
                throw new NoSuchElementException();
            }
            throw e5;
        } catch (OutOfMemoryError e6) {
            throw new JsonParseException("Failed parsing JSON source to Json", e6);
        } catch (StackOverflowError e7) {
            throw new JsonParseException("Failed parsing JSON source to Json", e7);
        }
    }
}
