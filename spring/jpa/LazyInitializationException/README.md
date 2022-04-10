1. Run `./gradlew test -i`
2. See Exception
```aidl
2022-04-10 11:30:00.052 ERROR 92861 --- [o-auto-1-exec-1] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.hibernate.LazyInitializationException: failed to lazily initialize a collection of role: com.example.demo.db.model.Account.transactionList, could not initialize proxy - no Session] with root cause
```
