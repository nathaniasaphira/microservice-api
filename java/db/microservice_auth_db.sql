PGDMP      4                |            microservice_auth_db    14.12    16.3     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394    microservice_auth_db    DATABASE     �   CREATE DATABASE microservice_auth_db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';
 $   DROP DATABASE microservice_auth_db;
                postgres    false                        2615    2200    public    SCHEMA     2   -- *not* creating schema, since initdb creates it
 2   -- *not* dropping schema, since initdb creates it
                postgres    false            �           0    0    SCHEMA public    ACL     Q   REVOKE USAGE ON SCHEMA public FROM PUBLIC;
GRANT ALL ON SCHEMA public TO PUBLIC;
                   postgres    false    4            �            1259    16396    user    TABLE     �   CREATE TABLE public."user" (
    id bigint NOT NULL,
    username character varying(50) NOT NULL,
    password character varying(255) NOT NULL
);
    DROP TABLE public."user";
       public         heap    postgres    false    4            �            1259    16395    users_id_seq    SEQUENCE     �   CREATE SEQUENCE public.users_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.users_id_seq;
       public          postgres    false    210    4            �           0    0    users_id_seq    SEQUENCE OWNED BY     >   ALTER SEQUENCE public.users_id_seq OWNED BY public."user".id;
          public          postgres    false    209            \           2604    16404    user id    DEFAULT     e   ALTER TABLE ONLY public."user" ALTER COLUMN id SET DEFAULT nextval('public.users_id_seq'::regclass);
 8   ALTER TABLE public."user" ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    209    210    210            �          0    16396    user 
   TABLE DATA           8   COPY public."user" (id, username, password) FROM stdin;
    public          postgres    false    210   }       �           0    0    users_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.users_id_seq', 7, true);
          public          postgres    false    209            ^           2606    16406    user users_pkey 
   CONSTRAINT     O   ALTER TABLE ONLY public."user"
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);
 ;   ALTER TABLE ONLY public."user" DROP CONSTRAINT users_pkey;
       public            postgres    false    210            `           2606    16403    user users_username_key 
   CONSTRAINT     X   ALTER TABLE ONLY public."user"
    ADD CONSTRAINT users_username_key UNIQUE (username);
 C   ALTER TABLE ONLY public."user" DROP CONSTRAINT users_username_key;
       public            postgres    false    210            �   T   x�3�,-N-JIM�T1JT14P1��7L�KK5��H��
w*���7�/qN��6LOs�r�
�u�q�.5H4Jq�
����� {1�     