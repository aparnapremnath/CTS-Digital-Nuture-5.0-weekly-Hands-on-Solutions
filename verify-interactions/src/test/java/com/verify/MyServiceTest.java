package com.verify;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Arrange - create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Act - call the method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Verify - ensure getData() was actually called
        verify(mockApi).getData();
    }
}