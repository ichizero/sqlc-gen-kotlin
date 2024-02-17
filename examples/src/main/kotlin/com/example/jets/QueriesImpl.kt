// Code generated by sqlc. DO NOT EDIT.
// versions:
//   sqlc v1.25.0

package com.example.jets

import java.sql.Connection
import java.sql.SQLException
import java.sql.Statement

const val countPilots = """-- name: countPilots :one
SELECT COUNT(*) FROM pilots
"""

const val deletePilot = """-- name: deletePilot :exec
DELETE FROM pilots WHERE id = ?
"""

const val listPilots = """-- name: listPilots :many
SELECT id, name FROM pilots LIMIT 5
"""

class QueriesImpl(private val conn: Connection) : Queries {

  @Throws(SQLException::class)
  override fun countPilots(): Long? {
    return conn.prepareStatement(countPilots).use { stmt ->
      
      val results = stmt.executeQuery()
      if (!results.next()) {
        return null
      }
      val ret = results.getObject(1) as Long
      if (results.next()) {
          throw SQLException("expected one row in result set, but got many")
      }
      ret
    }
  }

  @Throws(SQLException::class)
  override fun deletePilot(id: Int) {
    conn.prepareStatement(deletePilot).use { stmt ->
      stmt.setInt(1, id)

      stmt.execute()
    }
  }

  @Throws(SQLException::class)
  override fun listPilots(): List<Pilot> {
    return conn.prepareStatement(listPilots).use { stmt ->
      
      val results = stmt.executeQuery()
      val ret = mutableListOf<Pilot>()
      while (results.next()) {
          ret.add(Pilot(
                results.getObject(1) as Int,
                results.getObject(2) as String
            ))
      }
      ret
    }
  }

}

