(ns honeysql-postgis.helpers)


(defn ST_MakePoint
  [x y z]
  [:ST_MakePoint x y z])


(defn ST_Transform
  [g srid]
  [:ST_Transform g [:cast srid :integer]])


(defn ST_SetSRID
  [g srid]
  [:ST_SetSRID g [:cast srid :integer]])


(defn ST_3DDistance
  [g1 g2]
  [:ST_3DDistance g1 g2])


(defn ST_AsText
  [g]
  [:ST_AsText g])


(defn ST_3DClosestPoint
  [g1 g2]
  [:ST_3DClosestPoint g1 g2])


(defn ST_X
  [g]
  [:ST_X g])


(defn ST_Y
  [g]
  [:ST_Y g])


(defn ST_Z
  [g]
  [:ST_Z g])


(defn ST_M
  [g]
  [:ST_M g])


(defn ST_DumpPoints
  [g]
  [:ST_DumpPoints g])


(defn ST_MakeLine
  [g1 g2]
  [:ST_MakeLine g1 g2])


;; https://en.wikipedia.org/wiki/Join_(SQL)#Cross_join

;; (defmethod honeysql.format/format-clause :cross-join [[_ join-groups] _]
;;   (honeysql.format/space-join (map #(apply honeysql.format/format-join :cross %)
;;                                    (partition 2 join-groups))))

;; (defhelper cross-join [m args]
;;   (assoc m :cross-join (first args)))

;; (honeysql.format/register-clause! :cross-join 152) ;; TODO: Danger Will Robinson!

;; HoneySQL array syntax: https://github.com/jkk/honeysql/issues/85

;; The new WITH helper doesn't work with multiple ctes  https://github.com/jkk/honeysql/issues/164

;; Added OVER (PARTITION BY) clause #61
;; https://github.com/jkk/honeysql/pull/61/commits/9cf71871f3768bfd7f7b9912cc13a3e5c275a626
