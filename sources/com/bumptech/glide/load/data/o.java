package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamLocalUriFetcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o extends l<InputStream> {

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final UriMatcher f5241;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f5241 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public o(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private InputStream m6166(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f5241.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m6167(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m6167(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private InputStream m6167(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʻ */
    public Class<InputStream> mo6132() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* renamed from: ˈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo6133(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.l
    /* renamed from: ˉ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InputStream mo6134(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream m6166 = m6166(uri, contentResolver);
        if (m6166 != null) {
            return m6166;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
