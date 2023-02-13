package com.hazemuh.baseTemplate.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;


@Setter
@Getter
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "td_testing", schema = "public")
public class TdTesting implements Serializable {

    //    id_dokumen uuid NOT NULL,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @Column(name = "id_dokumen", nullable = false)
    private UUID idDokumen;

    //    id_probis uuid NULL,
    @Column(name = "id_probis", nullable = true)
    private UUID idProbis;

    //    id_header uuid NULL,
    @Column(name = "id_header", nullable = true)
    private UUID idHeader;

    //    id_header_referensi varchar(250) NULL,
    @Column(name = "id_header_referensi", nullable = true)
    private UUID idHeaderReferensi;

    //    kode_dokumen_penindakan varchar(250) NULL,
    @Column(name = "kode_dokumen_penindakan", nullable = true)
    private String kodeDokumenPenindakan;

    //    kode_jenis_kegiatan varchar(250) NULL,
    @Column(name = "kode_jenis_kegiatan", nullable = true)
    private String kodeJenisKegiatan;

    //    kode_dokumen varchar(250) NULL,
    @Column(name = "kode_dokumen", nullable = true)
    private String kodeDokumen;

    //    nomor_dokumen varchar(250) NULL,
    @Column(name = "nomor_dokumen", nullable = true)
    private String nomorDokumen;

    //    tanggal_dokumen date NULL,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Jakarta")
    @Column(name = "tanggal_dokumen", nullable = true)
    private Date tanggalDokumen;

    //    kode_kantor varchar(250) NULL,
    @Column(name = "kode_kantor", nullable = true)
    private String kodeKantor;

    //    tanggal_awal_berlaku date NULL,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Jakarta")
    @Column(name = "tanggal_awal_berlaku", nullable = true)
    private Date tanggalAwalBerlaku;

    //    tanggal_akhir_berlaku date NULL,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Jakarta")
    @Column(name = "tanggal_akhir_berlaku", nullable = true)
    private Date tanggalAkhirBerlaku;

    //    keterangan text NULL,
    @Column(name = "keterangan", nullable = true)
    private String keterangan;

    //    status varchar NULL,
    @Column(name = "status", nullable = true)
    private String status;

    //    nip_rekam varchar(18) NULL,
    @Column(name = "nip_rekam", length = 18, nullable = true)
    private String nipRekam;

    //    waktu_rekam timestamp NULL,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Jakarta")
    @Column(name = "waktu_rekam ", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuRekam;

    //    nip_update varchar(18) NULL,
    @Column(name = "nip_update", length = 18, nullable = true)
    private String nipUpdate;

    //    waktu_update timestamp NULL,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Jakarta")
    @Column(name = "waktu_update ", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuUpdate;





    public UUID getFirstResult() {
        return idDokumen;
    }
}
