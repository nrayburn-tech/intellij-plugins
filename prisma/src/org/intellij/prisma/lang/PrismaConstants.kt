package org.intellij.prisma.lang

object PrismaConstants {
  object PrimitiveTypes {
    const val STRING = "String"
    const val BOOLEAN = "Boolean"
    const val INT = "Int"
    const val FLOAT = "Float"
    const val DATETIME = "DateTime"
    const val JSON = "Json"
    const val BYTES = "Bytes"
    const val DECIMAL = "Decimal"
    const val BIGINT = "BigInt"
    const val UNSUPPORTED = "Unsupported"

    val ALL = setOf(
      STRING, BOOLEAN, INT, FLOAT, DATETIME,
      JSON, BYTES, DECIMAL, BIGINT, UNSUPPORTED,
    )
  }

  object Types {
    const val SORT_ORDER = "SortOrder"
    const val REFERENTIAL_ACTION = "ReferentialAction"
    const val INDEX_TYPE = "IndexType"
    const val OPERATOR_CLASS = "OperatorClass"
  }

  object Functions {
    const val ENV = "env"
    const val DBGENERATED = "dbgenerated"
    const val AUTO = "auto"
    const val AUTOINCREMENT = "autoincrement"
    const val SEQUENCE = "sequence"
    const val NOW = "now"
    const val UUID = "uuid"
    const val ULID = "ulid"
    const val CUID = "cuid"
    const val NANOID = "nanoid"
    const val RAW = "raw"
  }

  object DatasourceTypes {
    const val MYSQL = "mysql"
    const val POSTGRESQL = "postgresql"
    const val SQLITE = "sqlite"
    const val SQLSERVER = "sqlserver"
    const val MONGODB = "mongodb"
    const val COCKROACHDB = "cockroachdb"

    val ALL = setOf(MYSQL, POSTGRESQL, SQLITE, SQLSERVER, MONGODB, COCKROACHDB)
  }

  object BlockAttributes {
    const val ID = "@@id"
    const val MAP = "@@map"
    const val UNIQUE = "@@unique"
    const val INDEX = "@@index"
    const val FULLTEXT = "@@fulltext"
    const val IGNORE = "@@ignore"
    const val SCHEMA = "@@schema"
    const val SHARD_KEY = "@@shardKey"

    val ALL = setOf(ID, MAP, UNIQUE, INDEX, FULLTEXT, IGNORE, SCHEMA, SHARD_KEY)
  }

  object FieldAttributes {
    const val ID = "@id"
    const val MAP = "@map"
    const val UNIQUE = "@unique"
    const val DEFAULT = "@default"
    const val RELATION = "@relation"
    const val UPDATED_AT = "@updatedAt"
    const val IGNORE = "@ignore"
    const val SHARD_KEY = "@shardKey"

    val ALL = setOf(ID, MAP, UNIQUE, DEFAULT, RELATION, UPDATED_AT, IGNORE, SHARD_KEY)
  }

  object DatasourceFields {
    const val PROVIDER = "provider"
    const val URL = "url"
    const val SHADOW_DATABASE_URL = "shadowDatabaseUrl"
    const val DIRECT_URL = "directUrl"
    const val RELATION_MODE = "relationMode"
    const val EXTENSIONS = "extensions"
    const val SCHEMAS = "schemas"
  }

  object GeneratorFields {
    const val PROVIDER = "provider"
    const val OUTPUT = "output"
    const val PREVIEW_FEATURES = "previewFeatures"
    const val ENGINE_TYPE = "engineType"
    const val BINARY_TARGETS = "binaryTargets"
    const val MODULE_FORMAT = "moduleFormat"
    const val RUNTIME = "runtime"
    const val GENERATED_FILE_EXTENSION = "generatedFileExtension"
    const val IMPORT_FILE_EXTENSION = "importFileExtension"
  }

  object GeneratorProviderTypes {
    const val PRISMA_CLIENT_JS = "prisma-client-js"
    const val PRISMA_CLIENT = "prisma-client"
  }

  object ParameterNames {
    const val FIELDS = "fields"
    const val NAME = "name"
    const val MAP = "map"
    const val REFERENCES = "references"
    const val EXPRESSION = "expression"
    const val SORT = "sort"
    const val CLUSTERED = "clustered"
    const val LENGTH = "length"
    const val ON_DELETE = "onDelete"
    const val ON_UPDATE = "onUpdate"
    const val TYPE = "type"
    const val OPS = "ops"
  }
}
