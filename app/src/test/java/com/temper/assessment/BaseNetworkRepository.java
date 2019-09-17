package com.temper.assessment;

import android.net.Uri;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;

abstract class BaseNetworkRepository {

    MockWebServer mockServer;

    @Before
    public void setUp() throws IOException {
        this.configureMockServer();
    }

    @AfterTest
    public void tearDown() throws IOException {
        this.stopMockServer();
    }



    public void configureMockServer() throws IOException {
            mockServer = new MockWebServer();
            mockServer.start();
    }

    public void stopMockServer() throws IOException {
        mockServer.shutdown();
    }

    public void  mockHttpResponse(String fileName, int responseCode ) throws IOException {

        mockServer.enqueue(new MockResponse()
                .setResponseCode(responseCode)
                .setBody(getJson(fileName)));

    }

    public String getJson(String path) throws IOException {
        URL uri = ClassLoader.getSystemResource(path);
        File file = new File(uri.getPath());
        return FileUtils.readFileToString(file, "UTF-8");
    }
}