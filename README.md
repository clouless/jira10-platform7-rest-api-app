# jira10-platform7-rest-api-app

Jira 10, Platform 7, JDK17, REST V2 Demo App


```
curl -u admin:admin http://localhost:8080/rest/jira-rest-app-demo/1/demo/orders
```

:bangbang: Returns with null-values removed! This is not the behaviour of Jira 8/9!

```json
[
  {
    "orderId": "O-one",
    "customerId": "C-1",
    "subOrder": {
      "subOrderType": "shipping",
      "subOrderDetails": "customer want's it fast!"
    }
  },
  { 
    "orderId": "O-two", 
    "customerId": "C-2", 
    "subOrder": {} 
  },
  { 
    "orderId": "O-three" 
  }
]
```

:white_check_mark: How it should look:

```json
[
  {
    "orderId": "O-one",
    "customerId": "C-1",
    "subOrder": {
      "subOrderType": "shipping",
      "subOrderDetails": "customer want's it fast!"
    }
  },
  { 
    "orderId": "O-two", 
    "customerId": "C-2", 
    "subOrder": {
      "subOrderType": null,
      "subOrderDetails": null
    } 
  },
  { 
    "orderId": "O-three",
    "customerId": null,
    "subOrder": {
      "subOrderType": null,
      "subOrderDetails": null
    }
  }
]
```