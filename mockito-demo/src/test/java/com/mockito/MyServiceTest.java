package com.mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Arrange - create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub - define what the mock returns
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act - use the mock in the service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert - verify the result
        assertEquals("Mock Data", result);
    }
}