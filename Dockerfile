FROM trinodb/trino:434

COPY trino/etc/roles /etc/trino/roles
COPY target/*.jar /usr/lib/trino/plugin/jdbc/
