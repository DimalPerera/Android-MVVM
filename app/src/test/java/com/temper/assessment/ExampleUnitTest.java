package com.temper.assessment;


import com.temper.assessment.repository.NetworkRepository;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static junit.framework.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Mock
    public NetworkRepository networkRepository;

    @Before
    public void setUp() throws Exception {
        networkRepository = NetworkRepository.getInstance();
    }

    @Test
    public void checkNetworkRequest(){
        networkRepository.getJobList();
    }
}