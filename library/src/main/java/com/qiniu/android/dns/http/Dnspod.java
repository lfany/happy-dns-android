package com.qiniu.android.dns.http;

import com.qiniu.android.dns.Domain;
import com.qiniu.android.dns.IResolver;
import com.qiniu.android.dns.Record;

import java.io.IOException;
import java.net.HttpURLConnection;

/**
 * Created by bailong on 15/6/12.
 */
public class Dnspod implements IResolver {
    @Override
    public Record[] query(Domain domain) throws IOException {
        return null;
    }

}
